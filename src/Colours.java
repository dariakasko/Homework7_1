public enum Colours {
    RED (255, 0, 0){
        public String toString() { return "Color is red"; }
    },
    GREEN (0, 255, 0){
        public String toString() { return "Color is green"; }
    },
    BLUE (0, 0, 255) {
        public String toString() { return "Color is blue"; }
    },
    PINK (255, 100, 200) {
        public String toString() { return "Color is pink"; }
    };
    private int redIndexRGB, greenIndexRGB, blueIndexRGB;
    private Colours(int redIndexRGB, int greenIndexRGB, int blueIndexRGB) {
        this.redIndexRGB = redIndexRGB;
        this.greenIndexRGB = greenIndexRGB;
        this.blueIndexRGB = blueIndexRGB;
    }

    public String convertRGBtoHEX() {
        return "Heximal format: " + Integer.toHexString(redIndexRGB) + Integer.toHexString(greenIndexRGB) + Integer.toHexString(blueIndexRGB);
    }

}
