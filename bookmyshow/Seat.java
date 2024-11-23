package bookmyshow;



class Seat {
    private Integer seatId;
    private String seatNumber;
    private SeatType seatType;
    private SeatStatus seatStatus;

    // Constructors, getters, and setters

    public Integer getSeatId() {
        return seatId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }
}
