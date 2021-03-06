package com.example.studyit.data.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import io.reactivex.Flowable
import io.reactivex.Single

/********************************************************************************************************
 * Корневой интерфейс для всех интерфейсов DAO.                                                         *
 * Содержит самые общие методы для работы со всеми типами объектов.                                     *
 * @author Селетков Илья 2018 0628.                                                                     *
 *******************************************************************************************************/
interface IDAOBase<EntityType, IdentifierType>
{
    /****************************************************************************************************
     * Возвращает список всех объектов типа [EntityType], которые есть в базе данных с возможностью     *
     * отслеживания изменений в составе списка.                                                         *
     *                                                                                                  *
     * @return - список объектов с возможностью отслеживания изменений.                                 *
     ***************************************************************************************************/
    @Query("")
    fun get()                               : Single<List<EntityType>>
    /****************************************************************************************************
     * Возвращает список всех объектов типа [EntityType], которые есть в базе данных с возможностью     *
     * отслеживания изменений в составе списка.                                                         *
     *                                                                                                  *
     * @return - список объектов с возможностью отслеживания изменений.                                 *
     ***************************************************************************************************/
    @Query("")
    fun getFlowable()                       : Flowable<List<EntityType>>

    /****************************************************************************************************
     * Возвращает объект типа [EntityType] по идентификатору [id] с возможностью отслеживания изменений *
     * объекта.                                                                                         *
     *                                                                                                  *
     * @param id - идентификатор объекта.                                                               *
     * @return - обёртка над объектом с возможностью отслеживания изменений.                            *
     ***************************************************************************************************/
    @Query("")
    fun get(
        id                                  : IdentifierType
    )                                       : Single<EntityType>
    /****************************************************************************************************
     * Возвращает объект типа [EntityType] по идентификатору [id] с возможностью отслеживания изменений *
     * объекта.                                                                                         *
     *                                                                                                  *
     * @param id - идентификатор объекта.                                                               *
     * @return - обёртка над объектом с возможностью отслеживания изменений.                            *
     ***************************************************************************************************/
    @Query("")
    fun getFlowable(
        id                                  : IdentifierType
    )                                       : Flowable<EntityType>
    /****************************************************************************************************
     * Возвращает объект типа [EntityType] по идентификатору [id] с возможностью отслеживания изменений *
     * объекта.                                                                                         *
     *                                                                                                  *
     * @param id - идентификатор объекта.                                                               *
     * @return - обёртка над объектом с возможностью отслеживания изменений.                            *
     ***************************************************************************************************/
    @Query("")
    fun getSync(
        id                                  : IdentifierType
    )                                       : EntityType?

    /****************************************************************************************************
     * Insert an object in the database.                                                                *
     *                                                                                                  *
     * @param obj the object to be inserted.                                                            *
     ***************************************************************************************************/
    @Insert
    fun insert(obj                          : EntityType)

    /****************************************************************************************************
     * Update an object from the database.                                                              *
     *                                                                                                  *
     * @param obj the object to be updated.                                                             *
     ***************************************************************************************************/
    @Update
    fun update(obj                          : EntityType)

    /****************************************************************************************************
     * Delete an object from the database                                                               *
     *                                                                                                  *
     * @param obj the object to be deleted.                                                             *
     ***************************************************************************************************/
    @Delete
    fun delete(obj                          : EntityType)
}