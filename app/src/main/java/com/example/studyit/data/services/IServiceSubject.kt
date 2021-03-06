package com.example.studyit.data.services

import com.example.studyit.model.CSubject
import java.util.*

/********************************************************************************************************
 * Интерфейс описывает все методы бизнес-логики, которые могут применятся к объектам типа               *
 * [CSubject].                                                                                          *
 * @author Селетков И.П. 2019 0211.                                                                     *
 *******************************************************************************************************/
interface IServiceSubject                : IServiceBase<CSubject, UUID>
{
//    /****************************************************************************************************
//     * Возвращает список атрибутов по контрольному листу с идентификатором [checkListId].               *
//     *                                                                                                  *
//     * @return список атрибутов контрольного листа.                                                     *
//     ***************************************************************************************************/
//    fun getByCheckListSync(
//        checkListId                         : UUID
//    )                                       : List<CCheckListAttribute>
}