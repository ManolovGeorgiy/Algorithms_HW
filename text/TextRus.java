package com.org.sample.text;

public class TextRus {

    public static void main(String[] args) {
        String text = "Далеко-далеко за словесными горами в стране гласных и согласных живут рыбные тексты. Одна ее там пустился букв, сбить то алфавит имеет страну послушавшись города буквенных, моей заголовок раз не оксмокс диких, гор ведущими однажды инициал свой вопрос? Прямо, живет всеми. Путь вершину ручеек заманивший свою имени, парадигматическая щеке строчка взгляд необходимыми свой власти маленький залетают не первую. Страну прямо вдали залетают рыбного, обеспечивает моей о жизни свой дороге несколько то оксмокс вопрос имени однажды маленькая лучше продолжил живет наш знаках пунктуация заголовок. Лучше, текстов дал правилами меня грамматики точках щеке сих, силуэт страна возвращайся родного послушавшись реторический власти, великий решила безорфографичный океана которое приставка вдали lorem это большой осталось предупреждал. Над первую не ведущими пустился своих предложения, переписывается семантика деревни, щеке даже заманивший единственное от всех рукописи? Деревни свое, страна которое продолжил своих не lorem взобравшись свою буквенных вопроса все переписывается, составитель предупредила всеми пунктуация вскоре повстречался то последний? Назад даже эта речью коварный несколько рыбного одна семь! По всей, он взгляд! Которой гор ты рыбными, путь свою взгляд коварный над то точках реторический маленькая его живет подзаголовок знаках заглавных имеет! Алфавит составитель над он сих что строчка ipsum правилами моей. Имеет семь не которой одна правилами подпоясал пояс деревни рыбными вскоре маленький инициал, последний, запятой вопрос использовало эта, безорфографичный парадигматическая знаках диких заголовок свой меня ему переулка великий но! Пунктуация, подзаголовок приставка. Ему на берегу составитель свой предупредила лучше предложения домах встретил рыбными парадигматическая залетают своих речью, вопрос диких оксмокс родного страна даль снова ведущими по всей алфавит. Взгляд вопрос сих переписали великий свою осталось даже подпоясал встретил жизни? Реторический наш первую оксмокс если рекламных маленькая lorem злых свою пустился единственное, великий гор всемогущая он языкового, меня текст о пояс лучше. Его продолжил, которой жизни вершину оксмокс заманивший коварных ведущими свое. Деревни все эта жаренные, возвращайся вопрос, назад он курсивных переулка не гор путь ее несколько напоивший коварных океана силуэт алфавит семантика что по всей запятой жизни. Подзаголовок толку своих ему рот, возвращайся журчит текст вдали о дорогу текста на берегу они своего вопрос океана. Рукописи до наш использовало обеспечивает, вскоре предложения все речью своих переулка lorem сбить. Маленькая всемогущая послушавшись гор языком, своих, подзаголовок возвращайся однажды пор свою речью рот города пустился осталось взгляд которое первую. Домах на берегу гор речью дорогу строчка грамматики, если океана. Курсивных по всей эта, однажды грамматики парадигматическая заманивший жаренные предупредила собрал напоивший использовало! Снова буквенных злых своего запятой языкового вершину обеспечивает страну ручеек инициал, свой, коварных послушавшись, ведущими строчка. Пустился, единственное. Однажды, предупредила власти? Страна возвращайся наш бросил собрал? Лучше текста языкового то lorem большой домах наш пояс о? Коварный путь ты дорогу меня! Букв, толку себя пояс большого деревни о языкового? Великий подпоясал продолжил что заманивший заглавных пустился, грамматики буквоград океана предупредила. Вопроса lorem вопрос наш океана рекламных, свою жизни пустился там щеке это силуэт он взобравшись даже ее злых заглавных. Рыбными до все курсивных пустился свой, наш коварный! Раз однажды, сбить имени, свой города безорфографичный над проектах свою лучше, текстами ведущими коварный щеке приставка диких. Жаренные назад рукопись все грамматики продолжил! Жаренные подзаголовок одна ipsum города рыбного, всемогущая она деревни!";
        text = text.toLowerCase();

        System.out.println("Вычисление :");

        int[] frequencies = new int[33];

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'а';
                if (index >= 0 && index < frequencies.length) {
                    frequencies[index]++;
                }
            }
        }

        for (int i = 0; i < frequencies.length; i++) {
            char letter = (char) ('а' + i);
            System.out.println(letter + ": " + frequencies[i]);
        }
    }
}


