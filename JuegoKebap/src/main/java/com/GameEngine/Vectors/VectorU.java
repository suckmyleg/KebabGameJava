package com.GameEngine.Vectors;

public class VectorU extends Vector{
    public VectorU() {
    }

    public VectorU(double x, double y, double z) {
        super(x, y, z);
    }

    public VectorU(int x, int y, int z) {
        super(x, y, z);
    }

    public VectorU(double x, double y) {
        super(x, y);
    }

    public VectorU(int x, int y) {
        super(x, y);
    }

    public VectorU(int x) {
        super(x);
    }

    public VectorU(double x) {
        super(x);
    }

    @Override
    public String toString(){
        return super.toString() + " " + (this.getX()+this.getY()+this.getZ()>0?this.getX()==1?"⇘":this.getY()==1?"⇑":"⇙":this.getX()==-1?"⇖":this.getY()==-1?"⇓":this.getZ()==-1?"⇗":"-");
    }
}
