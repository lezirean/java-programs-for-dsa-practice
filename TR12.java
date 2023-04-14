import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class TR12{

	// A binary tree node has data,
	// pointer to left and right children
	static class Node{
		int data;
		Node left, right;

		public Node(int data){
			this.data = data;
			this.left = this.right = null;
		}
	}

	// Function to return if tree
	// are isomorphic or not
	static boolean isIsomorphic(Node root1, Node root2){
		// If Both roots are null
		// then tree is isomorphic
		if (root1 == null && root2 == null)
			return true;

		// Check if one node
		// is false
		else if (root1 == null || root2 == null)
			return false;

		Queue<Node> q1 = new LinkedList<>(), q2 = new LinkedList<>();

		// Enqueue roots
		q1.add(root1);
		q2.add(root2);

		int level = 0;
		int size;

		ArrayList<Integer> v2 = new ArrayList<>();
		HashMap<Integer, Integer> mp = new HashMap<>();

		while (!q1.isEmpty() && !q2.isEmpty()){
			// check if no. of nodes are
			// not same at a given level
			if (q1.size() != q2.size())
				return false;

			size = q1.size();
			level++;
			v2.clear();
			mp.clear();

			while (size-- > 0){
				// Dequeue the nodes
				Node temp1 = q1.poll();
				Node temp2 = q2.poll();

				// Check if value
				// exists in the map
				if (!mp.containsKey(temp1.data))
					mp.put(temp1.data, 1);
				else
					mp.put(temp1.data, mp.get(temp1.data) + 1);

				v2.add(temp2.data);

				// Enqueue the child nodes
				if (temp1.left != null)
					q1.add(temp1.left);

				if (temp1.right != null)
					q1.add(temp1.right);

				if (temp2.left != null)
					q2.add(temp2.left);

				if (temp2.right != null)
					q2.add(temp2.right);
			}

			// Iterate through each node
			// at a level to check whether
			// it exists or not.
			for (Integer i : v2){
				if (!mp.containsKey(i))
					return false;
				else{
					mp.put(i, mp.get(i) - 1);

					if (mp.get(i) < 0)
						return false;
					else if (mp.get(i) == 0)
						mp.remove(i);
				}
			}

			// Check if the key remain
			if (mp.size() != 0)
				return false;
		}
			return true;
	}

	// Driver program
	public static void main(String[] args){
		// Create tree
		Node n1 = new Node(1);
		n1.left = new Node(2);
		n1.right = new Node(3);
		n1.left.left = new Node(4);
		n1.left.right = new Node(5);
		n1.right.left = new Node(6);
		n1.left.right.left = new Node(7);
		n1.left.right.right = new Node(8);

		Node n2 = new Node(1);
		n2.left = new Node(3);
		n2.right = new Node(2);
		n2.right.left = new Node(4);
		n2.right.right = new Node(5);
		n2.left.right = new Node(6);
		n2.right.right.left = new Node(8);
		n2.right.right.right = new Node(7);

		if (isIsomorphic(n1, n2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}


