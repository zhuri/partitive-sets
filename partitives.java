import java.util.*;

class Partitives {
	public static void main(String[] args) {
		//Partitives.makeCombos();
		Partitives.recursiveMakeCombos(3);
	}

	public static void makeCombos() {
		int[] elements = new int[]{1,2,3,4,5};
		List<Double> doubles = new ArrayList<>();
		List<Triple> triples = new ArrayList<>();
		List<Quatro> quatros = new ArrayList<>();

		List<Numerator> numerators = new ArrayList<>();

		for(int i = 0; i < elements.length; i++) {
			for(int j = i+1; j < elements.length; j++) {
				doubles.add(new Double(elements[i],elements[j]));
			}
		}

		for(int i = 0; i < elements.length; i++) {
			for(int j = i+1; j < elements.length; j++) {
				for(int k = j+1; k < elements.length; k++) {
					triples.add(new Triple(elements[i], elements[j], elements[k]));
				}
			}
		}

		for (int i = 0; i< elements.length; i++) {
			for(int j = i+1; j < elements.length; j++) {
				for(int k = j+1; k < elements.length; k++) {
					for(int m = k+1; m < elements.length; m++) {
						quatros.add(new Quatro(elements[i], elements[j], elements[k], elements[m]));
					}
				}
			}
		}

		for(int i = 0; i < elements.length; i++) {
			for(int j = i + 1; j < elements.length; j++) {
				numerators.add(new Numerator(new ArrayList<Integer>(Arrays.asList(elements[i], elements[j]))));
			}
		}

		for (Double doub : doubles) {
			System.out.println(doub);
		}

		for (Triple trip : triples) {
			System.out.println(trip);
		}

		for (Quatro quatro : quatros) {
			System.out.println(quatro);
		}

		for (Numerator num : numerators) {
			num.asString();
		}

	}

	public static void recursiveMakeCombos(int numOfLoops) {
		for (int i = 0; i < numOfLoops; i++) {
			System.out.println("outer");	
			recursiveMakeCombos(numOfLoops);
		}
		System.out.println("inner");
	}
}

class Double {
	private int num1, num2;
	public Double(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public String toString() {
		return "{" + this.num1 + "," + this.num2 + "}";
	}
}

class Triple {
	private int num1, num2, num3;
	public Triple(int num1,int num2,int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public String toString() {
		return "{" + this.num1 + "," + this.num2 + "," + this.num3 + "}";
	}
}

class Quatro {
	private int num1, num2, num3, num4;
	public Quatro(int num1, int num2, int num3, int num4) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}

	public String toString() {
		return "{" + this.num1 + "," + this.num2 + "," + this.num3 + "," + this.num4 + "}";
	}
}

class Numerator {
	private List<List<Integer>> numberCollection = new ArrayList<>();

	public Numerator(List<Integer> numberCollection) {
		this.numberCollection.add(numberCollection);
	}

	public void asString() {
		for(List<Integer> num : numberCollection) {
			System.out.println("{" + num + "}");
		}
	}
}
