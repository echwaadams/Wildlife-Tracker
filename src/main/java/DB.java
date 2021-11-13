import org.sql2o.*;
public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "moringa", "hacked");

//    static String connectionString = "jdbc:postgresql://ec2-54-160-103-135.compute-1.amazonaws.com:5432/d1q2m3ggquhh42";
//       static Sql2o sql2o = new Sql2o(connectionString, "dsfkoayzkogpeb","eb2cc4b557499f2213ff616bc0f6353fdec6b2a8a57177693b0eb4fdebf1732c");
    //postgres://dsfkoayzkogpeb:eb2cc4b557499f2213ff616bc0f6353fdec6b2a8a57177693b0eb4fdebf1732c@ec2-54-160-103-135.compute-1.amazonaws.com:5432/d1q2m3ggquhh42
}
