//============================================================================
// Name        : Practice.cpp
// Author      : Nilesh
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include<exception>
using namespace std;

class ArithmaticException : public exception{
	int line;
	string file;
	string function;
	string message;

public:
	ArithmaticException(int line, string file,string function):line(line),file(file),function(function){
		cout<<"Divide by 0 at line "+ to_string(line) +" in function: "+ function + " ("+file+")";
	}

	const virtual char* what()const noexcept{
		return message.c_str();
	}

};

int divide(int a,int b){
	if(b==0)
		throw ArithmaticException(__LINE__, __func__ ,__FILE__);
	return a/b;
}

int main() {

	try{
		cout<<"Result : "<< divide(10,0)<<endl;
	}catch(ArithmaticException& e ){
		cout<<e.what()<<endl;
	}
	return 0;
}
