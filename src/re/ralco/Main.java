package re.ralco;

import processing.core.PApplet;

public class Main extends PApplet {
    public Main() {
    }

    public static void main(String[] args) {
        String[] processingArgs = new String[]{"MySketch"};
        Main mySketch = new Main();
        PApplet.runSketch(processingArgs, mySketch);
    }

    public void settings() {
        this.size(500, 500);
    }

    public void draw() {
        this.ellipse((float)this.mouseX, (float)this.mouseY, 50.0F, 50.0F);
    }

    public void mousePressed() {
        this.background(64);
    }
}
