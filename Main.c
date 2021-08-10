
#include<stdio.h>

int main()
{
    char arr[20] = {'\0'};

    printf("Enter String\n");
    scanf("%[^'\n']s",arr);

    printf("%s\n",arr);

    return 0;
}