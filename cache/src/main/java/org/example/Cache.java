package org.example;

import org.example.cache.policies.LRUEvictionPolicy;
import org.example.cache.storage.HashMapStorage;
import org.example.cache.storage.Storage;
import org.example.cache.policies.EvictionPolicy;
import org.example.cache.storage.Storage;
public class Cache<Key,Value> {
     Storage<Key,Value> storage;
     EvictionPolicy<Key> evictionPolicy;

    public Cache(EvictionPolicy<Key> evictionPolicy, Storage<Key, Value> storage) {
        this.evictionPolicy = evictionPolicy;
        this.storage = storage;
    }

      void put(Key k , Value v){
          try{
              this.storage.add(k,v);
              this.evictionPolicy.keyAccessed(k);
          }
          catch (Exception e){
              Key keyToRemove = evictionPolicy.evictKey();
              if(keyToRemove == null){
                  throw new RuntimeException();
              }
              this.storage.remove(keyToRemove);
              put(k,v);
          }
      }

      public  Value get(Key k){
        try {
            Value value = this.storage.get(k);
            this.evictionPolicy.keyAccessed(k);
            return value;
        } catch (RuntimeException e) {
            return null;
        }
      }

    public static void main(String[] args) {
        // Create eviction policy and storage
        EvictionPolicy<String> evictionPolicy = new LRUEvictionPolicy();
        Storage<String, String> storage = new HashMapStorage<>(2); // Capacity 2

        // Create Cache instance
        Cache<String, String> cache = new Cache<>(evictionPolicy, storage);

        // Test put and get
        cache.put("1", "one");
        cache.put("2", "two");

        System.out.println("Get 1: " + cache.get("1")); // Access 1 to mark as recently used
        cache.put("3", "three"); // This should evict "2"

        System.out.println("Get 2 (should be null): " + cache.get("2"));
        System.out.println("Get 3: " + cache.get("3"));
    }
}