
public class Polymorphism {

    public static void main(String[] args){

        Plant plant1=new Plant();
        Tree tree=new Tree();

        Plant plant2=tree;

        plant2.grow();
        plant1.grow();

        tree.fallLeaves();
        //plant2.fallleaves();---This won't work.




    }
}
