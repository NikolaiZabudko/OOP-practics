package practica;

public enum Season {
    WINTER(-18) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(10) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(6) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };

    private final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
