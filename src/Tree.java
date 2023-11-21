import java.util.logging.Level;

public class Tree {
    class Element
    {
        protected int Data;
        protected Element Left;
        protected Element Right;

        public Element(int data) {
            Data = data;
            Left = null;
            Right = null;
            System.out.println("EConstructor:\t" + Integer.toHexString(hashCode()));
        }
        protected void finalize(){
            System.out.println("EDestructor:" + Integer.toHexString(hashCode()));
        }
    }
    protected Element Root;

    public Element getRoot()
    {
        return  Root;
    }
    public Tree()
    {
        Root = null;
        System.out.println("TConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public void insert (int Data)
    {
        insert(Data, Root);
    }
    private void insert(int Data, Element Root)
    {
        if(this.Root == null)this.Root = new Element(Data);
        if (Root == null)return;
        if(Data< Root.Data)
        {
            if(Root.Left == null)Root.Left = new Element(Data);
            else insert(Data, Root.Left);
        }
        else
        {
            if(Root.Right == null)Root.Right = new Element(Data);
            else insert(Data, Root.Right);
        }
    }
public void erase (int Data)
{
    erase(Data, Root);
}
private void erase(int Data, Element Root)
{
    if(Root == null)return;
    if(Data == Root.Data)
    {
        if(Root.Left == Root.Right)
        {
            Root = null;
            System.gc();
        }
        else
        {

        }
    }
}

    public void clear()
    {
        Root = null;
        System.gc();   //Garbage Collector - Сборщик мусора
    }

private int minValue(Element Root)
{
    /*if(Root.Left == null)return Root.Data;
        else return minValue(Root.Left);*/
    if (Root == null)return 0;
    return Root.Left == null ? Root.Data : minValue(Root.Left);
}
public int minValue()
{
    return minValue(Root);
}

public int maxValue()
{
    if (Root == null)return 0;
    return maxValue(Root);
}
private int maxValue(Element Root)
{
    /*if(Root.Right == null)return Root.Data;
    else return maxValue(Root.Right);*/
    return Root.Right == null ? Root.Data : maxValue(Root.Right);
}
private int sum (Element Root)
{
    /*if (Root == null)return 0;
    else return sum(Root.Left) + sum(Root.Right) + Root.Data;*/
    return Root == null ? 0 : sum(Root.Left) + sum(Root.Right) + Root.Data;
}

public int sum()
{
    return sum(Root);
}
public void print()
{
    print(Root);
    System.out.println();
}

public int count() {
   return count(Root);
}
private int count(Element Root)
{
    /*if(Root) == null) return 0;
else return count(Root.Left) + count(Root.Right) + 1;*/
    return Root == null ? 0 : count(Root.Left) + count(Root.Right) + 1;
}

public double avg()
{
    return (double) sum(Root)/count(Root);
}
    private void print(Element Root)
    {
        if(Root == null)return;
        print(Root.Left);
        System.out.print(Root.Data + "\t");
        print(Root.Right);

    }

    private int depth (Element Root){
        if (Root == null) {
            return 0;
        }
        return 1 + depth(Root.Left) + depth(Root.Right);
    }
    public int depth() {
        return depth(Root);
    }
    public void depth_print (Element Root) {
        depth_print(Root, 0);
    }
    private void depth_print (Element Root, int depth) {
        if (Root !=null) {
            //return;
        }
    }
    public int depth_print (int i) {
        return depth_print(Root, i);
    }
    private void depth_print (Element Root, int i);
}
