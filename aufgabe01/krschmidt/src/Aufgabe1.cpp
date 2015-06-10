//============================================================================
// Name        : Aufgabe1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	int x;
	cout << "Please enter a number: ";
	cin >> x;
	for(int i=0; i<=x; i++)
	{
		if((i%3)==0)
		{
			cout << "Fizz";
			if(i%5==0) cout << "Buzz";
		}else
		{
			if(i%5==0)
			{
				cout << "Buzz";
			}else
			{
				cout << i;
			}

		}
		cout << endl;
	}

	return 0;
}
