public class Lasagna {
    static int ovenTime = 40;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return ovenTime;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int time) {
        int remain = ovenTime - time;
        return remain < 0 ? (remain * -1) + ovenTime : remain;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
       return layers * 2;
    }


    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int time) {
        return preparationTimeInMinutes(layers) + time;
    }
}
