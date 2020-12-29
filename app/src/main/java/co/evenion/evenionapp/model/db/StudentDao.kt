package co.evenion.evenionapp.model.db.repository

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import co.evenion.evenionapp.model.entity.Student
import io.reactivex.Flowable

/**
 * Created by muhrahmatullah on 12/08/18.
 */
@Dao
interface StudentDao {
    @Query("SELECT * from students")
    fun getAll(): Flowable<List<Student>>

    @Query("SELECT * FROM students WHERE id = :id ")
    fun getById(id: String): Flowable<Student>

    @Insert(onConflict = REPLACE)
    fun insert(student: Student)

    @Delete
    fun delete(student: Student)

    @Query("UPDATE students SET name =:studentName, num =:studentNim, gender =:studentGen WHERE id =:studentId")
    fun update(studentId: Long, studentName:String, studentNim:String, studentGen:String)
}