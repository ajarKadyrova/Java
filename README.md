Repository: Java
Creation Date:02.09.2021
Azhar Kadyrova 

#This repo contains my projects
***
##This is trial file
![alt text](javaLogo.png)

___
Random code
```C++
#include <iostream>
using namespace std;
class Figure {
private:
	double length, width;
public:
	Figure() :length(0), width(0) {} // constructor
	class Exception {}; ///Exeption class
	double rect_area(double a) {
		if (a <= 0){
			throw Exception();
		}
		return a * a;
	}
	double rect_area(double a, double b) {
		if (a <= 0 || b <= 0) {
			throw Exception();
		}
		return a * b;
	}
};
int main() {
	double figure1, figure2_1, figure2_2;
	Figure fig1;
	Figure fig2;
	cout << "Enter one side of figure:" << endl;
	cin >> figure1;
	try {
		cout << endl << "Figure 1: " << fig1.rect_area(figure1) << endl;
	}
	catch(Figure::Exception){
		cout << "Invalid data is entered. Calculation is impossible" << endl;
	}
	cout << "Enter both sides of figure:" << endl;
	cout << "Enter A:";
	cin >> figure2_1;
	cout << "Enter B:";
	cin >> figure2_2;
	try {
		cout << "Figure 2: " << fig2.rect_area(figure2_1, figure2_2) << endl;
	}
	catch (Figure::Exception) {
		cout << "Invalid data is entered. Calculation is impossible" << endl;
	}
	system("pause");
	return 0;
}
```