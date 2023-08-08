class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Percorre os dígitos de trás para frente
        for (int i = n - 1; i >= 0; i--) {
            // Se o dígito atual for menor que 9, basta adicionar 1 e retornar o array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // Se o dígito atual for 9, precisamos definir o dígito como 0 e continuar verificando o próximo dígito
            digits[i] = 0;
        }
        
        // Se todos os dígitos forem 9, então precisamos criar um novo array com um dígito a mais, onde o primeiro dígito é 1
        int[] newArray = new int[n + 1];
        newArray[0] = 1;
        return newArray;
    }
}
