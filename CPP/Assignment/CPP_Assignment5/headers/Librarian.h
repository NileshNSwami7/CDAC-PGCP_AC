/*
 * Librarian.h
 *
 *  Created on: 06-Sep-2026
 *      Author: Nilesh
 */

#ifndef LIBRARIAN_H_
#define LIBRARIAN_H_

#include<iostream>
#include<"Person.h">

using namespace std;

class Librarian : public Person{
	int employeeid;
	double salary;

public:
	Librarian();
	Librarian(int employeeid,double salary,int id, const string& name,const string phone);
	~Librarian();

	void displayInfo() override;

	Librarian& add(const Librarian& other);
};




#endif /* LIBRARIAN_H_ */
