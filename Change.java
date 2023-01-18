public class Change {
    long quarters;
    long dimes;
    long nickels;
    long pennies;

    // would allow for various inputs if more time
    public Change() {

    }

    public Change(long quarters, long dimes, long nickels, long pennies) {
        this.quarters = quarters;
        this.dimes = dimes;
        this.nickels = nickels;
        this.pennies = pennies;
    }

    public long getQuarters() {
        return quarters;
    }

    public long getDimes() {
        return dimes;
    }

    public long getNickels() {
        return nickels;
    }

    public long getPennies() {
        return pennies;
    }

    public void setQuarters(long quarters) {
        this.quarters = quarters;
    }

    public void setDimes(long dimes) {
        this.dimes = dimes;
    }

    public void setNickels(long nickels) {
        this.nickels = nickels;
    }

    public void setPennies(long pennies) {
        this.pennies = pennies;
    }

    public void printChange(){
        System.out.println("Quarters: " + Long.toString(quarters));
        System.out.println("Dimes: " + Long.toString(dimes));
        System.out.println("Nickels: " + Long.toString(nickels));
        System.out.println("Pennies: " + Long.toString(pennies));
    }
}