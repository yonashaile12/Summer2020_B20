package RepitTasks;

public class Carpet {

    //do not change -- Start
    public double width,length,unitPrice,totalPrice;
    public boolean isPersian;
    //do not change -- End

    //Add constructors below

    public Carpet(){
        width = 300;
        length = 300;
        isPersian = false;
        unitPrice = 0;
        totalPrice = 200;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double totalPrice(){

        if(isPersian){
            return (width+length)*2;
        }

        return (width+length)*2+200;

    }

    public static void main(String[] args) {
        Carpet c  = new Carpet();
        System.out.println(c.totalPrice);
    }



}

