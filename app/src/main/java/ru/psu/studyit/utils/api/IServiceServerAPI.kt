package ru.psu.studyit.utils.api

import ru.psu.studyit.model.CSubject
import io.reactivex.Single
import retrofit2.Call
import java.util.*

/********************************************************************************************************
 * Интерфейс описывает методы сервиса для работы с API сервера смарт-обходчик.                          *
 * @author Селетков И.П. 2018 0816.                                                                     *
 *******************************************************************************************************/
interface IServiceServerAPI
{
    /****************************************************************************************************
     * Запрос в API сервера списка дисциплин, которые должен проходить студент с учётной записью        *
     * [userId].                                                                                        *
     * @param userId - идентификатор учётной записи пользователя, для которой необходимо получить       *
     * список дисциплин.                                                                                *
     * @return объект для отслеживания статуса запроса.                                                 *
     ***************************************************************************************************/
    fun fetchSubjects() : Call<List<CSubject>>
}