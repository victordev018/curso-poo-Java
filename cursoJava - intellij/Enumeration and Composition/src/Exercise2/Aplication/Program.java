package Exercise2.Aplication;

import Exercise2.entities.Comment;
import Exercise2.entities.Post;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) throws ParseException {
        // criando formato para formatar as datas e horários
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // comentários do post 1
        Comment c1 = new Comment("Muito legal esse conteúdo!");
        Comment c2 = new Comment("Boa Sorte João!");

        // instanciando post 1
        Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:19", fmt),
                "Aprendendo Java com o melhor!",
                "praticando exercícios de composição",
                12);
        // adicionando comentários no post 1
        p1.addComment(c1);
        p1.addComment(c2);

        // comentários do post 2
        Comment c3 = new Comment("Praia Maravilhosa!");
        Comment c4 = new Comment("Nada melhor que essa liberdade!");

        // instanciando post 2
        Post p2 = new Post(LocalDateTime.now(),
                "Praia + Programação == perfeição",
                "Uma das vantanges do 'home' office hahaha!",
                96);
        // adicionando comentários do post 2
        p2.addComment(c3);
        p2.addComment(c4);

        // exibindo posts
        System.out.println("\n"+p1);
        System.out.println(p2);

    }

}
