package com.tnsif.Constructor;

	class Box{
		int a,b,c;
		Box(int x, int y, int z){
			a=x;
			b=y;
			c=z;
			System.out.println("This is constructor");
		}
		public void volume(){
			int vol = a*b*c;
			System.out.println(vol);
		}
	}

	public class ParameterisedConstructor {
		public static void main(String[] args) {
			Box b = new Box(20,35,50);
			b.volume();

		}

	}
