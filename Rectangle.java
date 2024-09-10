//Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

public class Rectangle 
{
    private float width;
    private float height;

    public Rectangle(float width, float height)
    {
        this.width=width;
        this.height=height;
    }

    public float getWidth()
    {
        return width;
    }
    public float getHeight()
    {
        return height;
    }
    public void setWidth(float width)
    {
        this.width=width;
    }
    public void getHeight(float height)
    {
        this.height=height;
    }

    public float area(float width, float height)
    {
        return (width*height);
    }
    public float perimeter(float width, float height)
    {
        return(2*(width+height));
    }
}

class Main
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(4,5);
        float w=r.getWidth();
        float h=r.getHeight();
        System.out.println(r.area(w,h));
    }
}
