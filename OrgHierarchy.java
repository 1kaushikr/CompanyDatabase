import java.util.Collections;
import java.util.Vector;

class Node1
{ 
	int id;
	int level;
	Node1 boss;
	Vector<Node1> Under;
	public int level1()
	{
		return level;
	}
	public int id1()
	{
		return id;
	}
	public Node1 boss1()
	{
		return boss;
	}
	public Vector<Node1> Under1()
	{
		return Under;
	}
	public Node1()
	{
		this.id = 0;
		this.level = 0;
		this.boss = null;
		this.Under = null;
	}
}

class Node
{
	Node1 E1;
	Node1 E2;
	Node1 E3;
	Node parent;
	Vector<Node> Children;
	public Node parent1()
	{
		return parent;
	}
	public Vector<Node> children1()
	{
		return Children;
	}
	public Node1 E1()
	{
		return E1;
	}
	public Node1 E2()
	{
		return E2;
	}
	public Node1 E3()
	{
		return E3;
	}
	public Node()
	{
		this.parent = null;
		this.Children = null;
	}
}

class OrgHierarchy implements OrgHierarchyInterface
{ 
	Node root = new Node();
	int N = 0;
	int ownerid;

	public boolean isEmpty()
	{
		return (N==0);	
	} 

	public int size()
	{
		return N;
	}

	public Node1 givNod(int id,Node n) throws IllegalIDException
	{
		int u  = Size(n);
		if (n.Children != null)
		{
			Vector<Node> v = new Vector<Node>();
			v = n.Children ;
			if (u == 3)
			{
				if (id<n.E1.id)
				{

					return givNod(id, v.get(0));
				}
				else if (id == n.E1.id)
				{
					return n.E1;
				}
				else if (n.E1.id<id && id<n.E2.id)
				{
					return givNod(id, v.get(1));
				}
				else if (id == n.E2.id)
				{
					return n.E2;
				}
				else if (n.E2.id<id && id<n.E3.id)
				{
					return givNod(id, v.get(2));
				}
				else if (id == n.E3.id)
				{
					return n.E3;
				}
				else
				{
					return givNod(id, v.get(3));
				}
			}
			else if (u == 2)
			{
				if (id<n.E1.id)
				{
					return givNod(id, v.get(0));
				}
				else if (id == n.E1.id)
				{
					return n.E1;
				}
				else if (n.E1.id<id && id<n.E2.id)
				{
					return givNod(id, v.get(1));
				}
				else if (id == n.E2.id)
				{
					return n.E2;
				}
				else
				{
					return givNod(id, v.get(2));
				}
			}
			else
			{
				if (id<n.E1.id)
				{
					return givNod(id, v.get(0));
				}
				else if (id == n.E1.id)
				{
					return n.E1;
				}
				else
				{
					return givNod(id, v.get(1));
				}
			}
		}
		else
		{
			if (u == 3)
			{

				if (id == n.E1.id)
				{
					return n.E1;
				}
				else if (id == n.E2.id)
				{
					return n.E2;
				}
				else if (id == n.E3.id)
				{
					return n.E3;
				}
				else 
				{
					throw new IllegalIDException("Id not found");
				}
			}
			else if (u == 2)
			{
				if (id == n.E1.id)
				{
					return n.E1;
				}
				else if (id == n.E2.id)
				{
					return n.E2;
				}
				else 
				{
					throw new IllegalIDException("Id not found");
				}
			}
			else
			{
				if (id == n.E1.id)
				{
					return n.E1;
				}
				else 
				{
					throw new IllegalIDException("Id not found");
				}
			}
		}
	}

	public Node givNOD(int id,Node n) throws IllegalIDException
	{
		int u  = Size(n);
		if (n.Children != null)
		{
			Vector<Node> v = new Vector<Node>();
			v = n.Children ;
			if (u == 3)
			{
				if (id<n.E1.id)
				{
					return givNOD(id, v.get(0));
				}
				else if (id == n.E1.id)
				{
					return n;
				}
				else if (n.E1.id<id && id<n.E2.id)
				{
					return givNOD(id, v.get(1));
				}
				else if (id == n.E2.id)
				{
					return n;
				}
				else if (n.E2.id<id && id<n.E3.id)
				{
					return givNOD(id, v.get(2));
				}
				else if (id == n.E3.id)
				{
					return n;
				}
				else
				{
					return givNOD(id, v.get(3));
				}
			}
			else if (u == 2)
			{
				if (id<n.E1.id)
				{
					return givNOD(id, v.get(0));
				}
				else if (id == n.E1.id)
				{
					return n;
				}
				else if (n.E1.id<id && id<n.E2.id)
				{
					return givNOD(id, v.get(1));
				}
				else if (id == n.E2.id)
				{
					return n;
				}
				else
				{
					return givNOD(id, v.get(2));
				}
			}
			else
			{
				if (id<n.E1.id)
				{
					return givNOD(id, v.get(0));
				}
				else if (id == n.E1.id)
				{
					return n;
				}
				else
				{
					return givNOD(id, v.get(1));
				}
			}
		}
		else
		{
			if (u == 3)
			{

				if (id == n.E1.id || id == n.E2.id || id == n.E3.id)
				{
					return n;
				}
				else 
				{
					throw new IllegalIDException("Id not found");
				}
			}
			else if (u == 2)
			{
				if (id == n.E1.id || id == n.E2.id )
				{
					return n;
				}
				else 
				{
					throw new IllegalIDException("Id not found");
				}
			}
			else
			{

				if (id == n.E1.id)
				{
					return n;
				}
				else 
				{
					throw new IllegalIDException("Id not found");
				}
			}
		}
	}

	public int level(int id) throws IllegalIDException, EmptyTreeException
	{
		if (N==0)
		{
			throw new EmptyTreeException("Tree is Empty");
		}
		{
			Node1 n = givNod(id,root);
			return n.level1();
		}
	} 

	public void hireOwner(int id) throws NotEmptyException
	{
		if (N != 0)
		{
			throw new NotEmptyException("Already has owner");
		}
		else
		{
			Node1 n = new Node1();
			n.id = id;
			n.level = 1;
			root.E1 = n;
			N = N + 1;
			ownerid = id;
		}
	}

	public int Size(Node n)
	{
		int k = 0;
		Node1 n1 = n.E1();
		Node1 n2 = n.E2();
		Node1 n3 = n.E3();
		if (n1 != null)
		{
			k = k + 1;
		}
		if (n2 != null)
		{
			k = k + 1;
		}
		if (n3 != null)
		{
			k = k + 1;
		}
		return k;
	}

	public Node fitNode(int id, Node n)
	{
		int u = Size(n);
		if (n.Children == null)
		{
			return n;
		}
		else
		{
			if (u == 1)
			{
				if (id<n.E1.id)
				{
					return fitNode(id,n.Children.get(0));
				}
				else
				{
					return fitNode(id,n.Children.get(1));
				}
			}
			else if (u == 2)
			{
				if (id<n.E1.id)
				{
					return fitNode(id,n.Children.get(0));
				}
				else if (n.E1.id<id && id<n.E2.id)
				{
					return fitNode(id,n.Children.get(1));
				}
				else
				{
					return fitNode(id,n.Children.get(2));
				}
			}
			else  
			{	
				if (id<n.E1.id)
				{
					return fitNode(id,n.Children.get(0));
				}
				else if (n.E1.id<id && id<n.E2.id)
				{
					return fitNode(id,n.Children.get(1));
				}
				else if (n.E2.id<id && id<n.E3.id)
				{
					return fitNode(id,n.Children.get(2));
				}
				else
				{
					return fitNode(id,n.Children.get(3));
				}
			}
		}
	}

	public void insert(Node1 n1, Node n)
	{
		if (Size(n) == 1)
		{
			if (n.E1.id>n1.id)
			{
				n.E2 = n.E1;
				n.E1 = n1;
			}
			else
			{
				n.E2 = n1;
			}
		}
		else if (Size(n) == 2)
		{
			if (n.E1.id>n1.id)
			{
				n.E3 = n.E2;
				n.E2 = n.E1;
				n.E1 = n1;
			}
			else if (n1.id>n.E1.id && n1.id<n.E2.id)
			{
				n.E3 = n.E2;
				n.E2= n1;
			}
			else
			{
				n.E3 = n1;
			}
		}
		else
		{
			if (n == root)
			{
				Node X = new Node();
				Node Y = new Node();
				Node Z = new Node();
				if (n1.id<root.E1.id)
				{
					X.E1 = root.E1;
					Y.E1 = n1;
					Z.E1 = root.E2;
					Z.E2 = root.E3;
				}
				else if (root.E1.id < n1.id && n1.id < root.E2.id)
				{
					X.E1 = n1;
					Y.E1 = root.E1;
					Z.E1 = root.E2;
					Z.E2 = root.E3;
				}
				else if (root.E2.id < n1.id && n1.id < root.E3.id)
				{
					X.E1 = root.E2;
					Y.E1 = root.E1;
					Z.E1 = n1;
					Z.E2 = root.E3;
				}
				else
				{
					X.E1 = root.E2;
					Y.E1 = root.E1;
					Z.E1 = root.E3;
					Z.E2 = n1;
				}
				Vector<Node> v = new Vector<Node>();
				v.add(0,Y);
				v.add(1,Z);
				X.Children =  v;
				Y.parent = X;
				Z.parent = X;
				if (root.Children == null)
				{
					root = X;
				}
				else
				{
					Vector<Node> u = new Vector<Node>();
					u.add(0,root.Children.get(0));
					u.add(1,root.Children.get(1));
					Vector<Node> w = new Vector<Node>();
					w.add(0,root.Children.get(2));
					w.add(1,root.Children.get(3));
					w.add(2,root.Children.get(4));
					Y.Children = u;
					Z.Children = w;
					root = X;
				}
			}
			else if(n.Children==null)
			{ 
				int j = n.parent.Children.indexOf(n);
				Node Y = new Node();
				Node Z = new Node();
				if (n1.id<n.E1.id)
				{
					Y.E1 = n1;
					Z.E1 = n.E2;
					Z.E2 = n.E3;
					Y.parent = n.parent;
					Z.parent = n.parent;
					n.parent.Children.set(j,Y);
					n.parent.Children.add(j+1,Z);
					insert(n.E1,n.parent);
				}
				else if (n.E1.id < n1.id && n1.id < n.E2.id)
				{
					Y.E1 = n.E1;
					Z.E1 = n.E2;
					Z.E2 = n.E3;
					Y.parent = n.parent;
					Z.parent = n.parent;
					n.parent.Children.set(j,Y);
					n.parent.Children.add(j+1,Z);
					insert(n1,n.parent);
				}
				else if (n.E2.id < n1.id && n1.id < n.E3.id)
				{
					Y.E1 = n.E1;
					Z.E1 = n1;
					Z.E2 = n.E3;
					Y.parent= n.parent1();
					Z.parent = n.parent1();
					n.parent.Children.set(j,Y);
					n.parent.Children.add(j+1,Z);
					insert(n.E2,n.parent);
				}
				else
				{
					Y.E1 = n.E1;
					Z.E1 = n.E3;
					Z.E2 = n1;
					Y.parent = n.parent1();
					Z.parent = n.parent1();
					n.parent.Children.set(j,Y);
					n.parent.Children.add(j+1,Z);
					insert(n.E2,n.parent);
				}
			}
			else
			{
				int j = n.parent.Children.indexOf(n);
				Node Y = new Node();
				Node Z = new Node();
				if (n1.id<n.E1.id)
				{
					Y.E1 = n1;
					Z.E1 = n.E2;
					Z.E2 = n.E3;
					Vector<Node> p = new Vector<Node>();
					p.add(0,n.Children.get(0));
					p.add(1,n.Children.get(1));
					Vector<Node> q = new Vector<Node>();
					q.add(0,n.Children.get(2));
					q.add(1,n.Children.get(3));
					q.add(3,n.Children.get(3));
					Y.Children = p;
					Z.Children = q;
					n.parent.Children.set(j,Y);
					n.parent.Children.add(j+1,Z);
					Y.parent = n.parent1();
					Z.parent = n.parent1();
					insert(n.E1,n.parent);
				}
				else if (n.E1.id < n1.id && n1.id < n.E2.id)
				{
					Y.E1 = n.E1;
					Z.E1 = n.E2;
					Z.E2 = n.E3;
					Vector<Node> p = new Vector<Node>();
					p.add(0,n.Children.get(0));
					p.add(1,n.Children.get(1));
					Vector<Node> q = new Vector<Node>();
					q.add(0,n.Children.get(2));
					q.add(1,n.Children.get(3));
					q.add(3,n.Children.get(3));
					Y.Children = p;
					Z.Children = q;
					n.parent.Children.set(j,Y);
					n.parent.Children.add(j+1,Z);
					Y.parent = n.parent1();
					Z.parent = n.parent1();
					insert(n1,n.parent);
				}
				else if (n.E2.id < n1.id && n1.id < n.E3.id)
				{
					Y.E1 = n.E1;
					Z.E1 = n1;
					Z.E2 = n.E3;
					Vector<Node> p = new Vector<Node>();
					p.add(0,n.Children.get(0));
					p.add(1,n.Children.get(1));
					Vector<Node> q = new Vector<Node>();
					q.add(0,n.Children.get(2));
					q.add(1,n.Children.get(3));
					q.add(3,n.Children.get(3));
					Y.Children = p;
					Z.Children = q;
					n.parent.Children.set(j,Y);
					n.parent.Children.add(j+1,Z);
					Y.parent = n.parent1();
					Z.parent = n.parent1();
					insert(n.E2,n.parent);
				}
				else
				{
					Y.E1 = n.E1;
					Z.E1 = n.E3;
					Z.E2 = n1;
					Vector<Node> p = new Vector<Node>();
					p.add(0,n.Children.get(0));
					p.add(1,n.Children.get(1));
					Vector<Node> q = new Vector<Node>();
					q.add(0,n.Children.get(2));
					q.add(1,n.Children.get(3));
					q.add(3,n.Children.get(3));
					Y.Children = p;
					Z.Children = q;
					n.parent.Children.set(j,Y);
					n.parent.Children.add(j+1,Z);
					Y.parent = n.parent1();
					Z.parent = n.parent1();
					insert(n.E2,n.parent);
				}
			}
		}
	}

	public void hireEmployee(int id, int bossid) throws IllegalIDException, EmptyTreeException{
		if (N==0)
		{
			throw new EmptyTreeException("Tree is Empty");
		}
		else
		{
			Node m = fitNode(id,root);
			Node1 v = new Node1();
			v.id = id;
			insert(v,m);
			Node1 d = givNod(bossid,root);
			Node1 e = givNod(id,root);
			e.boss = d;
			e.level = d.level + 1;
			if (d.Under == null)
			{
				Vector<Node1> z = new Vector<Node1>();
				z.add(0,e);
				d.Under = z;
			}
			else
			{
				d.Under.add(e);
			}
			N = N + 1;
		}
	} 

	public void fireEmployee(int id) throws IllegalIDException,EmptyTreeException
	{
		if (N==0)
		{
			throw new EmptyTreeException("Tree is Empty");
		}
		else
		{
			Node1 e = givNod(id,root); 
			Node1 f = e.boss; 
			Node p = new Node();
			p = givNOD(id,root);
			delete(e,p);
			f.Under.remove(f.Under.indexOf(e));
			N = N - 1;
		}
	}

	public void delfrmLeaf(Node1 n1,Node n)
	{
		if (n==root && Size(root)==1)
		{
			if (root.Children == null)
			{
				root.E1 = null;
			}
			else
			{
				root = root.Children.get(0);
			}
		}
		else
		{
			int w = n.parent.Children.indexOf(n);
			int k = Math.abs(w-1);
			Node z = n.parent.Children.get(k);
			int b = Size(z);
			if (b == 3)
			{
				if(w==0)
				{
					n.E1 = n.parent.E1;
					n.parent.E1 = z.E1;
					z.E1 = z.E2;
					z.E2 = z.E3;
					z.E3 = null;
				}
				else if (w==1)
				{
					n.E1 = n.parent.E1;
					n.parent.E1 = z.E3;
				}
				else if (w==2)
				{
					n.E1 = n.parent.E2;
					n.parent.E2 = z.E3;
				}
				else
				{
					n.E1 = n.parent.E3;
					n.parent.E3 = z.E3;
				}
			}
			else if (b==2)
			{
				if(w==0)
				{
					n.E1 = n.parent.E1;
					n.parent.E1 = z.E1;
					z.E1 = z.E2;
					z.E2 = null;
				}
				else if (w==1)
				{
					n.E1 = n.parent.E1;
					n.parent.E1 = z.E2;
				}
				else if (w==2)
				{
					n.E1 = n.parent.E2;
					n.parent.E2 = z.E2;
				}
				else
				{
					n.E1 = n.parent.E3;
					n.parent.E3 = z.E2;
				}
			}
			else 
			{
				if (n.Children == null)
				{
					int f = Size(n.parent);
					if (f==2)
					{
						Node j = new Node();
						if (w==1)
						{
							j.E1 = z.E1;
							j.E2 = n.parent.E1;
							n.parent.E1 = n.parent.E2;
							n.parent.E2 = null;
							n.parent.Children.set(1, n.parent.Children.get(2));
							n.parent.Children.set(0, j);
							n.parent.Children.set(2, null);
						}
						else if (w==2)
						{
							j.E1 = z.E1;
							j.E2 = n.parent.E2;
							n.parent.E2 = null;
							n.parent.Children.set(2, null);
							n.parent.Children.set(1, j);
						}
						else
						{
							j.E2 = z.E1;
							j.E1 = n.parent.E1;
							n.parent.E1 = n.parent.E2;
							n.parent.E2 = null;
							n.parent.Children.set(1, n.parent.Children.get(2));
							n.parent.Children.set(2, null);
							n.parent.Children.set(0, j);
						}
						j.parent = n.parent;
					}
					else if (f==3)
					{
						Node j = new Node();
						if (w==1)
						{
							j.E1 = z.E1;
							j.E2 = n.parent.E1;
							n.parent.E1 = n.parent.E2;
							n.parent.E2 = n.parent.E3;
							n.parent.E3 = null;
							n.parent.Children.set(1, n.parent.Children.get(2));
							n.parent.Children.set(2, n.parent.Children.get(3));
							n.parent.Children.set(0, j);
							n.parent.Children.set(3, null);
						}
						else if (w==2)
						{
							j.E1 = z.E1;
							j.E2 = n.parent.E2;
							n.parent.E2 = n.parent.E3;
							n.parent.E3 = null;
							n.parent.Children.set(2, n.parent.Children.get(3));
							n.parent.Children.set(3, null);
							n.parent.Children.set(1, j);
						}
						else if (w==3)
						{
							j.E1 = z.E1;
							j.E2 = n.parent.E3;
							n.parent.E3 = null;
							n.parent.Children.set(2, j);
							n.parent.Children.set(3, null);
						}
						else
						{
							j.E2 = z.E1;
							j.E1 = n.parent.E1;
							n.parent.E1 = n.parent.E2;
							n.parent.E2 = n.parent.E3;
							n.parent.E3 = null;
							n.parent.Children.set(1, n.parent.Children.get(2));
							n.parent.Children.set(2, n.parent.Children.get(3));
							n.parent.Children.set(0, j);
							n.parent.Children.set(3, null);
						}
						j.parent = n.parent;
					}
					else
					{
						Node j = new Node();
						if (w==0)
						{
							j.E2 = z.E1;
							j.E1 = n.parent.E1;
							n.parent.Children.set(0, j);
							n.parent.Children.set(1, null);
							j.parent = n.parent;
							delfrmLeaf(n.parent.E1,n.parent);
						}
						else
						{
							j.E1 = z.E1;
							j.E2 = n.parent.E1;
							n.parent.Children.set(0, j);
							n.parent.Children.set(1, null);
							j.parent = n.parent;
							delfrmLeaf(n.parent.E1,n.parent);
						}
					}
				}
				else
				{
					int f = Size(n.parent);
					if (f==2)
					{
						Node j = new Node();
						if (w==1)
						{
							j.E1 = z.E1;
							j.E2 = n.parent.E1;
							n.parent.E1 = n.parent.E2;
							n.parent.E2 = null;
							n.parent.Children.set(1, n.parent.Children.get(2));
							n.parent.Children.set(0, j);
							n.parent.Children.set(2, null);
							j.Children.add(0,z.Children.get(0));
							j.Children.add(1,z.Children.get(1));
							j.Children.add(2,n.Children.get(0));
						}
						else if (w==2)
						{
							j.E1 = z.E1;
							j.E2 = n.parent.E2;
							n.parent.E2 = null;
							n.parent.Children.set(2, null);
							n.parent.Children.set(1, j);
							j.Children.add(0,z.Children.get(0));
							j.Children.add(1,z.Children.get(1));
							j.Children.add(2,n.Children.get(0));
						}
						else
						{
							j.E2 = z.E1;
							j.E1 = n.parent.E1;
							n.parent.E1 = n.parent.E2;
							n.parent.E2 = null;
							n.parent.Children.set(1, n.parent.Children.get(2));
							n.parent.Children.set(2, null);
							n.parent.Children.set(0, j);
							j.Children.add(0,n.Children.get(0));
							j.Children.add(1,z.Children.get(0));
							j.Children.add(2,n.Children.get(1));
						}
						j.parent = n.parent;
					}
					else if (f==3)
					{
						Node j = new Node();
						if (w==1)
						{
							j.E1 = z.E1;
							j.E2 = n.parent.E1;
							n.parent.E1 = n.parent.E2;
							n.parent.E2 = n.parent.E3;
							n.parent.E3 = null;
							n.parent.Children.set(1, n.parent.Children.get(2));
							n.parent.Children.set(2, n.parent.Children.get(3));
							n.parent.Children.set(0, j);
							n.parent.Children.set(3, null);
							j.Children.add(0,z.Children.get(0));
							j.Children.add(1,z.Children.get(1));
							j.Children.add(2,n.Children.get(0));

						}
						else if (w==2)
						{
							j.E1 = z.E1;
							j.E2 = n.parent.E2;
							n.parent.E2 = n.parent.E3;
							n.parent.E3 = null;
							n.parent.Children.set(2, n.parent.Children.get(3));
							n.parent.Children.set(3, null);
							n.parent.Children.set(1, j);
							j.Children.add(0,z.Children.get(0));
							j.Children.add(1,z.Children.get(1));
							j.Children.add(2,n.Children.get(0));
						}
						else if (w==3)
						{
							j.E1 = z.E1;
							j.E2 = n.parent.E3;
							n.parent.E3 = null;
							n.parent.Children.set(2, j);
							n.parent.Children.set(3, null);
							j.Children.add(0,z.Children.get(0));
							j.Children.add(1,z.Children.get(1));
							j.Children.add(2,n.Children.get(0));
						}
						else
						{
							j.E2 = z.E1;
							j.E1 = n.parent.E1;
							n.parent.E1 = n.parent.E2;
							n.parent.E2 = n.parent.E3;
							n.parent.E3 = null;
							n.parent.Children.set(1, n.parent.Children.get(2));
							n.parent.Children.set(2, n.parent.Children.get(3));
							n.parent.Children.set(0, j);
							n.parent.Children.set(3, null);
							j.Children.add(0,n.Children.get(0));
							j.Children.add(1,z.Children.get(0));
							j.Children.add(2,n.Children.get(1));
						}
						j.parent = n.parent;
					}
					else
					{
						Node j = new Node();
						if (w==0)
						{
							j.E2 = z.E1;
							j.E1 = n.parent.E1;
							n.parent.Children.set(0, j);
							n.parent.Children.set(1, null);
							j.Children.add(0,n.Children.get(0));
							j.Children.add(1,z.Children.get(0));
							j.Children.add(2,n.Children.get(1));
							j.parent = n.parent;
							delfrmLeaf(n.parent.E1,n.parent);
						}
						else
						{
							j.E1 = z.E1;
							j.E2 = n.parent.E1;
							n.parent.Children.set(0, j);
							n.parent.Children.set(1, null);
							j.Children.add(0,z.Children.get(0));
							j.Children.add(1,z.Children.get(1));
							j.Children.add(2,n.Children.get(0));
							j.parent = n.parent;
							delfrmLeaf(n.parent.E1,n.parent);
						}
					}
				}
			}
		}
	}

	public void delete(Node1 n1, Node n)
	{
		int u = Size(n);
		if (n.Children==null)
		{
			if (u==3)
			{
				if (n.E1.id == n1.id)
				{
					n.E1 = n.E2;
					n.E2 = n.E3;
					n.E3 = null;
				}
				else if (n.E2.id == n1.id)
				{
					n.E2 = n.E3;
					n.E3 = null;
				}
				else
				{
					n.E3 = null;
				}
			}
			else if (u==2)
			{
				if (n.E1.id == n1.id)
				{
					n.E1 = n.E2;
					n.E2 = null;
				}
				else
				{
					n.E3 = null;
				}
			}
			else
			{
				delfrmLeaf(n1,n);
			}
		}
		else
		{
			if (u==1)
			{
				Node v = n.Children.get(1);
				while (v.Children != null)
				{
					v = v.Children.get(0);
				}
				Node1 r = n.E1;
				n.E1 = v.E1;
				v.E1 = r;
				delete(v.E1,v);
			}
			else if (u==2)
			{
				if (n1.id == n.E1.id)
				{
					Node v = n.Children.get(1);
					while (v.Children != null)
					{
						v = v.Children.get(0);
					}
					Node1 r = n.E1;
					n.E1 = v.E1;
					v.E1 = r;
					delete(v.E1,v);
				}
				else
				{
					Node v = n.Children.get(2);
					while (v.Children != null)
					{
						v = v.Children.get(0);
					}
					Node1 r = n.E2;
					n.E2 = v.E1;
					v.E1 = r;
					delete(v.E1,v);
				}
			}
			else
			{
				if (n1.id == n.E1.id)
				{
					Node v = n.Children.get(1);
					while (v.Children != null)
					{
						v = v.Children.get(0);
					}
					Node1 r = n.E1;
					n.E1 = v.E1;
					v.E1 = r;
					delete(v.E1,v);
				}
				else if (n1.id == n.E2.id)
				{
					Node v = n.Children.get(2);
					while (v.Children != null)
					{
						v = v.Children.get(0);
					}
					Node1 r = n.E2;
					n.E2 = v.E1;
					v.E1 = r;
					delete(v.E1,v);
				}
				else 
				{
					Node v = n.Children.get(3);
					while (v.Children != null)
					{
						v = v.Children.get(0);
					}
					Node1 r = n.E3;
					n.E3 = v.E1;
					v.E1 = r;
					delete(v.E1,v);
				}
			}
		}
	}

	public void fireEmployee(int id, int manageid) throws IllegalIDException,EmptyTreeException{
		if (N==0)
		{
			throw new EmptyTreeException("Tree is Empty");
		}
		else
		{
			Node p = new Node();
			p = givNOD(id,root);
			Node1 q = givNod(id,root);
			delete(q,p);
			Node1 l = givNod(manageid,root);
			Vector<Node1> v = new Vector<Node1>();
			for (int i = 0; i<q.Under.size(); i++)
			{
				v.add(q.Under.get(i));
				q.Under.get(i).boss = l;
			}
			l.Under = v;
			Node1 f = q.boss;
			f.Under.remove(f.Under.indexOf(q));
			N = N - 1;
		}
	} 

	public int boss(int id) throws IllegalIDException,EmptyTreeException
	{
		if (N==0)
		{
			throw new EmptyTreeException("Tree is Emoty");
		}
		else if (id==ownerid)
		{
			return -1;
		}
		else
		{
		Node1 n = givNod(id,root);
		Node1 b = n.boss;
		return b.id;
		}
	}

	public int lowestCommonBoss(int id1, int id2) throws IllegalIDException,EmptyTreeException
	{
		if (N==0)
		{
			throw new EmptyTreeException("Tree is Empty");
		}
		if (id1 == ownerid || id2 == ownerid)
		{
			return -1;
		}
		Node1 n1 = givNod(id1,root);
		Node1 n2 = givNod(id2,root);
		return lowestCommonBoss1(n1,n2);
	}

	public int lowestCommonBoss1(Node1 n1, Node1 n2) throws IllegalIDException,EmptyTreeException
	{
		if (n1.id == ownerid || n2.id == ownerid)
		{
			return ownerid;
		}
		if (n1.boss.id == n2.boss.id)
		{
			return n1.boss.id;
		}
		else if(n1.level>=n2.level)
		{
			return lowestCommonBoss1(n1.boss,n2);
		}
		else
		{
			return lowestCommonBoss1(n1,n2.boss);
		}
	}

	public String toString(int id) throws IllegalIDException, EmptyTreeException
	{
		if (N==0)
		{
			throw new EmptyTreeException("Tree is Empty");
		}
		Node1 n = givNod(id, root);
		Queue g = new Queue();
		g.enque(n);
		Node1 q = new Node1();
		q.id = -1;
		g.enque(q);
		Vector<Integer> v = Palti(g);
		Vector<Integer> u = new Vector<>();
		int i = 0;
		while(i<v.size())
		{
			Vector<Integer> e = new Vector<>();
			while(true)
			{
				if (v.get(i)==-1)
				{
					i = i + 1;
					break;
				}
				else
				{
					e.add(v.get(i));
					i = i + 1;
				}
			}
			Collections.sort(e);
			for(int j=0 ; j<e.size(); j++)
			{
				u.add(e.get(j));
			}
			u.add(-1);
		}
		String s = "";
		for (int k = 0; k< u.size()-1; k++)
		{
			if ((Integer)u.get(k) != -1)
			{ 
				if (u.get(k+1) != -1)
				{
					s = s + u.get(k) + " ";
				}
				else
				{
					s = s + u.get(k);
				}
			}
			else
			{
				s = s + ",";
			}
		}
		return s;
	}


	public Vector<Integer> Palti(Queue q)
	{
		Vector<Integer> j = new Vector<>();
		while(q.Size()!=0)
		{
			Node1 o = (Node1) q.deque();
			if (o.id==-1 && q.Size() != 0)
			{
				q.enque(o);
				j.add(-1);
			}
			else
			{
				Vector<Node1> v =  o.Under1();
				if (v != null)
				{
					for (int i = 0; i<v.size(); i++)
					{
						q.enque(v.get(i));
					}
				}
				j.add(o.id1());
			}
		}
		return j;
	}
}

class Queue
{
	int N = 0;
	int f = -1;

	Vector<Object> v = new Vector<>(100,100);

	public int Size()
	{
		return N;
	}

	public void enque(Object o)
	{
		if (f==-1)
		{
			v.add(0,o);
			f = 0;
		}
		else
		{
			v.add(o);
		}
		N = N + 1;
	}
	public Object deque()
	{
		Object o = v.set(f,null);
		N = N - 1;
		f = f + 1;
		return o;
	}
	public Object front()
	{
		Object o = v.get(f);
		return o;
	}
}
