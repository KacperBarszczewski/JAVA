

public class TrafficLights {
    enum LightsColor {
        GREEN, YELLOW, RED;

        private boolean nextRed;

        public void setNextRed(boolean nextRed) {
            this.nextRed = nextRed;
        }

        public boolean getNextRed() {
            return this.nextRed;
        }
    }

    private LightsColor currentColor = LightsColor.GREEN;

    public void changeColor() {
        switch (this.currentColor) {
            case GREEN -> {
                this.currentColor = LightsColor.YELLOW;
                LightsColor.YELLOW.setNextRed(true);
            }
            case RED -> {
                this.currentColor = LightsColor.YELLOW;
                LightsColor.YELLOW.setNextRed(false);
            }
            case YELLOW -> {
                if (LightsColor.YELLOW.getNextRed()) {
                    this.currentColor = LightsColor.RED;
                } else {
                    this.currentColor = LightsColor.GREEN;
                }
            }

        }
    }

    @Override
    public String toString() {
        return "Current Color: "+ currentColor;
    }
}
