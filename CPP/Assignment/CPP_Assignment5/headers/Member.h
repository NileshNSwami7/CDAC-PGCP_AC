/*
 * Member.h
 *
 *  Created on: 06-Sep-2026
 *      Author: Nilesh
 */

#ifndef MEMBER_H_
#define MEMBER_H_

#include<iostream>
#include<string>
#include<iomanip>

#include "Person.h"

using namespace std;

namespace LibrarySystem {

class Member: public Person {
	int numberOfBooks;
	int *issuedBookId;
	int bookCount;

public:
	Member();
	Member(int numberOfBooks, int bookCount,int id,const  string& name,const string& phone);
	Member(const Member& other);
	Member& operator=(const Member& other);

	~Member();

	void displyInfo()override;

	bool operator==(const Member& other)const;
	ostream& operator<<(ostream& out,const Member& other);
	istream& operator>>(istream& in,const Member& other);

};

}

#endif /* MEMBER_H_ */
