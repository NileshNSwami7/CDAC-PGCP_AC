/*
 * GenericDataProcess_Databuffer.cpp
 *
 *  Created on: 06-Sep-2026
 *      Author: Nilesh
 */

#include<iostream>

using namespace std;

template<typename T>
class DataBuffer {
private:

	T *data;
	int capacity;
	int head;
	int tail;
	int count;
public:
	DataBuffer(int capacity) :
			capacity(capacity), head(0), tail(0), count(0) {
		data = new T[capacity];
		cout << "DataBuffer constructor : " << capacity << endl;
	}

	void push(const T &value) {
		if (isFull()) {
			data[tail] = value;
			tail = (tail + 1) % capacity;
			head = (head + 1) % capacity;
			cout << "buffer is full" << endl;
			return;
		}

		data[tail] = value;
		tail = (tail + 1) % capacity;
		count++;

		cout << "Pushed value" << value << endl;
	}

	T pop() {
		if (isEmpty()) {
			cout << "No data avaialble" << endl;
			return T();
		}
		T value = data[head];
		head = (head + 1) % capacity;
		count--;
		cout << "Pop" << value << endl;
		return value;
	}

	T peek() const {
		if (isEmpty()) {
			cout << "No data avaialble" << endl;
			return T();
		}
		return data[head];
	}

	bool isEmpty() const {
		return count == 0;
	}
	bool isFull() const {
		return count == capacity;
	}
	int size() const {
		return count;
	}
	~DataBuffer() {
		delete[] data;
	}

	template<typename U>
	friend ostream& operator<<(ostream &out, const DataBuffer<U> &buf);

};
template<typename U>
ostream& operator<<(ostream &out, const DataBuffer<U> &buf) {
		out << buf.capacity;
		out << buf.head;
		out << buf.tail;
		out << buf.count;
		out<<endl;
		out << "data ";

		  for (int i = 0; i < buf.count; i++) {
		        int index = (buf.head + i) % buf.capacity;

		        out << buf.data[index];

		        if (i < buf.count - 1) {
		            out << ", ";
		        }
		    }

		    return out;
	}
int main() {
	DataBuffer<int> tickBuffer(5);
	for (int i = 1; i <= 7; i++) {
		tickBuffer.push(i * 10);
	}
	cout << "Tick Buffer : " << tickBuffer << endl;

	DataBuffer<double> tempBuffer(4);
	tempBuffer.push(36.6);
	tempBuffer.push(37.1);
	tempBuffer.push(38.2);
	tempBuffer.push(36.9);
	cout << "Before pop: " << tempBuffer << endl;
	cout << "Popped: " << tempBuffer.pop() << endl;
	cout << "After pop: " << tempBuffer << endl;

	DataBuffer<string> logBuffer(3);
	logBuffer.push("INFO: Server started");
	logBuffer.push("WARN: High memory usage");
	logBuffer.push("ERROR: DB connection timeout");
	logBuffer.push("INFO: Retry successful");
	// Overwrites oldest
	cout << "Log Buffer: " << logBuffer << endl;
	return 0;
}

