package com.example.demo;

import org.springframework.cglib.transform.ClassEmitterTransformer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/{codigo}")
    public String codigoMorse(@PathVariable String codigo){

        String textEmPortugues ="";
        String[] palavrasSeparado = codigo.split("   ");

        for (int i =0; i < palavrasSeparado.length;i++){

            String [] letraSeparada = palavrasSeparado[i].split(" ");
            for (int a = 0; a< letraSeparada.length; a++){
                textEmPortugues += magicaDatraducao(letraSeparada[a]);

            }

            textEmPortugues += " ";

        }

        //-- . .-..   -... .  MEL BE

        /*Mel
                espaco le a prox letra
                3 espaco nova palavra*/
        return  textEmPortugues;
    }

    private String magicaDatraducao(String s) {
        String returno = "";
        switch (s){
            case ".-":
                returno = "A";
                break;
            case "-...":
                returno = "B";
                break;
            case "-.-.":
                returno = "C";
                break;
            case "-..":
                returno = "D";
                break;
            case ".":
                returno = "E";
                break;
            case "..-.":
                returno = "F";
                break;
            case "--.":
                returno = "G";
                break;
            case "....":
                returno = "H";
                break;
            case "..":
                returno = "I";
                break;
            case ".---":
                returno = "J";
                break;
            case "-.-":
                returno = "K";
                break;
            case ".-..":
                returno = "L";
                break;
            case "--":
                returno = "M";
                break;
            case "-.":
                returno = "N";
                break;
            case "---":
                returno = "O";
                break;
            case ".--.":
                returno = "P";
                break;
            case "--.-":
                returno = "Q";
                break;
            case ".-.":
                returno = "R";
                break;
            case "...":
                returno = "S";
                break;
            case "-":
                returno = "T";
                break;
            case "..-":
                returno = "U";
                break;
            case "...-":
                returno = "V";
                break;
            case ".--":
                returno = "W";
                break;
            case "-..-":
                returno = "X";
                break;
            case "-.--":
                returno = "Y";
                break;
            case "--..":
                returno = "Z";
                break;
            case "-----":
                returno = "0";
                break;
            case ".----":
                returno = "1";
                break;
            case "-..---":
                returno = "2";
                break;
            case "...--":
                returno = "3";
                break;
            case "....-":
                returno = "4";
                break;
            case ".....":
                returno = "5";
                break;
            case "-....":
                returno = "6";
                break;
            case "--...":
                returno = "7";
                break;
            case "---..":
                returno = "8";
                break;
            case "----.":
                returno = "9";
                break;
            case ".-.-.-":
                returno = ".";
                break;
            case "--..--":
                returno = ",";
                break;
            case "..--..":
                returno = "?";
                break;
            default:{
                returno = "";
            }


        }
        return returno;
    }
}
