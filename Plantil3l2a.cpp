//Eliminar algunas advertencias durante la compilacion (Solo para VC++)
#define _CRT_SECURE_NO_DEPRECATE

//Atajos para tipos de datos "comunes" en concursos
typedef long long ll; //los comentarios integrados en el codigo
typedef pair<int, int> ii; //aparecen justificados a la derecha
typedef vector<ii> vii; 
typedef vector<int> vi;
#define INF 1000000000 //1000M, mas seguro que 200M para floyd warshall

//Opciones de memset habituales
memset(memo, -1,sizeof memo); //inicializar tabla memoizacion de DP con -1
memset(arr,0,sizeof arr); //vaciado de un array de enteros
/*
	i++;
	ans=a?b:c;
	ans+=val;
	index=(index+1)%n;
	index=(index+n-1)%n;
	ans=min(ans, new_computation);
	//forma alternativa, no usada en el libro: ans <?= new_computation
	//algun codigo utiliza los operadores de bits && (AND) y || (OR)
*/

