package javapatterns;

public class HierarchicalInheritance {
int a=10;
int b=10;
}
class Demo extends HierarchicalInheritance{
	int add()
	{
		return a+b;
	}
}
class De extends HierarchicalInheritance{
	int mul()
	{
		return a*b;
	}
}
