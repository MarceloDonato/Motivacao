package com.example.motivation.repository

import com.example.motivation.infra.MotivationConstants
import java.util.*

data class Phrase(val description: String, val category: Int)

class Mock {

    private val ALL = MotivationConstants.PHRASEFILTER.ALL
    private val MORNING = MotivationConstants.PHRASEFILTER.MORNING
    private val HAPPY = MotivationConstants.PHRASEFILTER.HAPPY


    private val mListPhrases: List<Phrase> = listOf(
        Phrase("Não sabendo que era empossivel, foi la e fez.", HAPPY),
        Phrase("Você não é derrotado quando perde, Você é derrotado quando desiste. ", HAPPY),
        Phrase("Quando está ,ais escuro, vemos mais estrelas", HAPPY),
        Phrase("Insanidade é fazer a mesma coisa e esperar um resultado diferente.", HAPPY),
        Phrase("Não pare quando estiver cansado, pare quando tiver terminado.", HAPPY),
        Phrase("o que voê pode fazer agora que tem o maior impacto sobre o seu sucesso?", HAPPY),
        Phrase("A melhor maneira de prever o futuro é inventá-lo.", MORNING),
        Phrase("Voê perde todas as chances que voê não aproveita.", MORNING),
        Phrase("Fracasso é o condimento que da sabor ao sucesso.", MORNING),
        Phrase("Enquanto nao estivermos comprometidos, haverá hesitação.", MORNING),
        Phrase("se você acreditar, faz toda a diferença", MORNING)
    )

    fun getPhrase(categoryid: Int): String {

        val filtered = mListPhrases.filter { (it.category == categoryid || categoryid == ALL) }

        val rand = Random().nextInt(filtered.size)

        return filtered[rand].description
    }


}