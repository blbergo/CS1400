#include <iostream>

using namespace std;

int main()
{
    int amountOfStudents = 0;
    int score1 = 0;
    int score2;
    string smartest;
    string secondSmartest;


    cout << "Enter the number of student: ";
    cin >> amountOfStudents;
    for(int i = 0; i < amountOfStudents; i++)
    {
        string name;
        cout << "Enter a student name: ";
        cin >> name;
        int score;
        cout << "Enter a student score: ";
        cin >> score;

        if(score1 < score)
        {
            secondSmartest = smartest;
            smartest = name;
            secondSmartest = score;
            score1 = score;
        }
    }
    cout << "Top two students: " << endl;
    cout << smartest << "'s score is " << score1 << endl;
    cout << secondSmartest << "'s score is " << score2 << endl;

    return 0;
}

