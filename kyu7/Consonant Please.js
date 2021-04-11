function sortLetters(ogList) {
//your code here
    let volwels = "AEIOU";
    let res_vowels = [];
    let count_vowels = 0;
    let consonants = [];
    let count_consonants = 0;
    ogList.forEach(list => { 
        list.forEach( char => {
            if (!(char >= '0' && char <= '9')) {
                let aux = ""+char.toUpperCase();
                if(volwels.indexOf(aux) >= 0){
                    res_vowels[count_vowels] = aux;
                    count_vowels++;
                } else {
                    consonants[count_consonants] = aux;
                    count_consonants++;
                }
            }
        }); 
    });
    return [res_vowels, consonants];
}