package leetcodehashing;

class Cluster {
}

class Node1 extends Cluster {
}

class Node2 extends Cluster {
}

public class KsCheck {
    public static void main(String[] args) {
        Cluster tree = new Node1();
        if (tree instanceof Cluster)
            System.out.println("Node1222");
        else if (tree instanceof Cluster)
            System.out.println("Cluster");
        else if (tree instanceof Node2)
            System.out.println("Node2");
        else
            System.out.println("Unexpected");
    }
}