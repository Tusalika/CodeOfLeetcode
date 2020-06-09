//C/C++实现
#include <iostream>

using namespace std;

typedef struct information{
    char name[6];
    int year, month, day;
}info;

int compare(const void *a_t, const void *b_t){
    info *a = (info *)a_t, *b = (info *)b_t;
    if(a->year != b->year){
        return a->year - b->year;
    }
    else if(a->month != b->month){
        return a->month - b->month;
    }
    else{
        return a->day - b->day;
    }
}

int main(){
    int n;
    scanf("%d", &n);
    info table[n], first = {"first", 2014, 9, 6}, last = {"last", 1814, 9, 6}; //之后改成n
    int count = 0;
    for(int i = 0; i < n; ++i){
        scanf("%s %d/%d/%d", table[count].name, &table[count].year, &table[count].month, &table[count].day);
        if(compare(&table[count], &first) > 0 || compare(&table[count], &last) < 0){
            continue;
        }
        ++count;
    }
    qsort(table, count, sizeof(table[0]), compare);
    if(count == 1){
        printf("1 %s %s\n", table[0].name, table[0].name);
    }
    else if(count > 1){
        printf("%d %s %s\n", count, table[0].name, table[count - 1].name);
    }
    else{
        printf("0\n");
    }
    return 0;
}
