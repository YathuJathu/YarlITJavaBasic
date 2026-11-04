class B extends A
{
	//int x=100;
	int y;
	B()
	{
		this.y=10;
		
	}
	void gety(){
		super.getx();
		System.out.println("B y"+this.y);
		
	}
	void getx(){
		int x=500;
		System.out.println("B x"+this.x);
		System.out.println("A x"+super.x);
		System.out.println("Local "+x);
	}
}
