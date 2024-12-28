package recursion;

import java.util.Stack;


public class MyTree<T_key, T_val>{

	MyNode<T_key, T_val> rootNode;
	
	public MyTree() {
		rootNode = null;
	}
	
	
	
	
	public MyNode<T_key, T_val> findNode (T_key findKey) {
		
		MyNode<T_key, T_val> currentNode = rootNode;
		
		while (currentNode.getKey() != findKey) {
			if (currentNode.getLeft() != null && currentNode.compareTo(findKey) == -1) {
				currentNode = currentNode.getLeft();
			} else if ((currentNode.getRight() != null && currentNode.compareTo(findKey) == 1)) {
				currentNode = currentNode.getRight();
			} else {
				System.err.println("Искомый узел не найден");
				return null;
			}
		}
		return currentNode;
	}	
	
	public void addNode(T_key newKey, T_val newValue) {
		
		MyNode<T_key, T_val> newNode = new MyNode<>();			//создаем новый узел
		newNode.setKey(newKey);									//устанавливая в него значения ключа
		newNode.setVal(newValue);								//и переменной для этого ключа
		
		if (rootNode == null) rootNode = newNode;				//если корневой узел пустой, то новый узел становится корнем
		else {													//если корень уже есть
			MyNode<T_key, T_val> currentNode = rootNode;		//начинаем поиск текущега узла с корня
			MyNode<T_key, T_val> parentNode;					//при этом родитель будет текущим узлом
			while (true){										//бесконечный цикл с внутренним выходом 
				parentNode = currentNode;
				if (currentNode.compareTo(newKey) == 0) {		//если ключ текущего узла совпадает с новым ключом
					currentNode.setVal(newValue);				//устанавливается в текущий узел новая переменная для этого ключа
					return;										//и выходим из метода
					
				}else if (currentNode.compareTo(newKey) == 1) {	//в ином случае если новый ключ больше нынешнего
					currentNode = currentNode.getRight();		//то правый узел становится текущим
					
					if (currentNode == null) {					//если найден пустой узел
						parentNode.setRight(newNode);			//в родитеьский узел устанавливается новая пара значений ключ - переменная
						return;									//и выходим из метода
					}
				}
				else if (currentNode.compareTo(newKey) == -1) {	//в ином случае если новый ключ меньше нынешнего
					currentNode = currentNode.getLeft();		//то левый узел становится текущим
					
					if (currentNode == null) {					//если найден пустой узел
						parentNode.setLeft(newNode);			//в родитеьский узел устанавливается новая пара значений ключ - переменная
						return;									//и выходим из метода
					}
				}
			}
		}
		
	}
	
	public boolean deleteNode(T_key delKey) {
		MyNode<T_key, T_val> currentNode = rootNode;												//поиск начинается с корневого узла
		if (rootNode == null) {
			System.err.println("Дерево отсутствует");
			return false;
		} else if (findNode(delKey) == null) {
			System.err.println("Искомый узел отсутствует");
			return false;
		} else {
			MyNode<T_key, T_val> removableNode = findNode(delKey);
			while (true) {																			//иначе запускаем цикл с выходом при находе удаляемого значения
				if (currentNode.compareTo(delKey) == 1) currentNode = currentNode.getRight();		//иначе двигаемся вправо
				else if (currentNode.compareTo(delKey) == -1) currentNode = currentNode.getLeft();	//или же влево
				else {																				//как только значение нашлось
					MyNode<T_key, T_val> delNode = currentNode;										//создается в качестве буфера значений
					if (currentNode.getLeft() == null && currentNode.getRight() == null) {			//если нет потомков у УУ
						delNode.setNullNode();														//просто затираем этот узел
						return true;
						
					} else if (currentNode.getLeft() == null && currentNode.getRight() != null) {	//если есть только правый
						currentNode = currentNode.getRight();										//правый становится на место удаляемого
						delNode.setNode(currentNode);
						return true;
						
					} else if (currentNode.getLeft() != null && currentNode.getRight() == null) {	//если есть только левый
						currentNode = currentNode.getLeft();										//левый становится на место удаляемого
						delNode.setNode(currentNode);
						return true;
						
					} else {																		//если есть оба потомка
						
						if (currentNode.getRight().getLeft() != null) {								//если у правого потомка УУ есть левый
							currentNode = currentNode.getRight();									//одно движение в правого потомка
							while (currentNode.getLeft() != null) {									//доходим до крайнего левого потомка правого потомка УУ
								currentNode = currentNode.getLeft();
							}
							
							T_key newDelKey = currentNode.getKey();									//буфер ключа
							T_val newDelVal = currentNode.getVal();									//буфер переменной
														
							this.deleteNode(currentNode.getKey());									//рекурсивно удаляется узел, который встанет на удаленное место
							
							removableNode.setKey(newDelKey);										//установка буферных значений в УУ
							removableNode.setVal(newDelVal);
							removableNode.setChild(removableNode);
							
						} else {
							
							MyNode<T_key, T_val> leftDelNode = currentNode.getLeft();
							currentNode.setNode(removableNode.getRight());
							currentNode.setLeft(leftDelNode);
								
						}
						return true;
					}
				}
			}
		}
	}
	

		
		
		
		
		
		
		
		
		
		
	
	
	public void printTree() { // метод для вывода дерева в консоль
	       Stack<MyNode<T_key, T_val>> globalStack = new Stack<MyNode<T_key, T_val>>(); // общий стек для значений дерева
	       globalStack.push(rootNode);
	       int gaps = 32; // начальное значение расстояния между элементами
	       boolean isRowEmpty = false;
	       String separator = "-----------------------------------------------------------------";
	       System.out.println(separator);// черта для указания начала нового дерева
	       while (isRowEmpty == false) {
	           Stack<MyNode<T_key, T_val>> localStack = new Stack<MyNode<T_key, T_val>>(); // локальный стек для задания потомков элемента
	           isRowEmpty = true;

	           for (int j = 0; j < gaps; j++)
	               System.out.print(' ');
	           while (globalStack.isEmpty() == false) { // покуда в общем стеке есть элементы
	        	   MyNode<T_key, T_val> temp = (MyNode<T_key, T_val>) globalStack.pop(); // берем следующий, при этом удаляя его из стека
	               if (temp != null && temp.getKey() != null) {
	                   System.out.print("|" + temp.getKey() + "|");
	                   localStack.push(temp.getLeft()); // соохраняем в локальный стек, наследники текущего элемента
	                   localStack.push(temp.getRight());
	                   if (temp.getLeft() != null ||
	                           temp.getRight() != null)
	                       isRowEmpty = false;
	               }
	               else {
	                   System.out.print("|-|");// - если элемент пустой
	                   localStack.push(null);
	                   localStack.push(null);
	               }
	               for (int j = 0; j < gaps * 2 - 3; j++)
	                   System.out.print(' ');
	           }
	           System.out.println();
	           gaps /= 2;// при переходе на следующий уровень расстояние между элементами каждый раз уменьшается
	           while (localStack.isEmpty() == false)
	               globalStack.push(localStack.pop()); // перемещаем все элементы из локального стека в глобальный
	       }
	       System.out.println(separator);// подводим черту
	   }
	
}
