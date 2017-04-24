#include<stdio.h>
#include<string.h>
#include<stdlib.h>

struct node {
	char name[10];
	double value;
}getResult[40];

int main() {
	FILE *name = fopen("name.txt", "r");
	FILE *hash = fopen("hashMap.txt", "r");
	int flag[40][40], len = 0, hig = 0;
	memset(flag, 0, sizeof(int) * 40 * 40);
	char temp[40];

	while (fgets(temp, 40, hash) != NULL) {
		for (int i = 0; i < strlen(temp)&&temp[i]!='\n'; i++) {
			flag[len][i] = temp[i] - '0';
		}
		len++;
	}
	hig = len;
	len = 0;
	while (fgets(temp, 40, name) != NULL) {
		if (strlen(temp) != 0) {
			strcpy(getResult[len].name, temp);
		}
		len++;
	}
	for (int i = 0; i < len; i++) {
		double Ncf=0, Ncs=0, Nuf=0, Nus=0;
		double result;
		for (int j = 0; j < hig; j++) {
			if (flag[j][37] == 0 && flag[j][i] == 0) {
				Nuf++;
			}
			if (flag[j][37] == 0 && flag[j][i] == 1) {
				Ncf++;
			}
			if (flag[j][37] == 1 && flag[j][i] == 0) {
				Nus++;
			}
			if (flag[j][37] == 1 && flag[j][i] == 1) {
				Ncs++;
			}
		}
		result = ((Ncf) / (Ncf + Nuf)) / (Ncf / (Ncf + Nuf) + Ncs / (Ncs + Nus));
		if (Ncf == 0)
			result = 0;
		getResult[i].value = result;
	}
	
	for (int i = 0; i < len; i++) {
		for (int j = i; j < len; j++) {
			if (getResult[i].value < getResult[j].value) {
				char tempName[40];
				double tempNum;
				strcpy(tempName, getResult[i].name);
				strcpy(getResult[i].name, getResult[j].name);
				strcpy(getResult[j].name, tempName);

				tempNum = getResult[i].value;
				getResult[i].value = getResult[j].value;
				getResult[j].value = tempNum;
			}
		}
	}

	FILE *R = fopen("ffffff.txt", "w+");
	printf("怀疑度排行榜：\n");
	for (int i = 0; i < len; i++) {
		printf("函数名：%s怀疑度：%.6f\n\n\n", getResult[i].name, getResult[i].value);
		fprintf(R, "%s的怀疑度是:%lf\n", getResult[i].name, getResult[i].value);
	}
	
	
	printf("***************************************\n");
	printf("最有可能出现问题的函数为:\n");
	for(int i=0;i<len;i++){
		if(getResult[i+1].value!=getResult[i].value){
			printf("%s",getResult[i].name);
			break;
		}
		else{
			printf("%s",getResult[i].name);
		}
	} 


	system("pause");
	return 0;
}
