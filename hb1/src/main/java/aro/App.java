package aro;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.sql.Date;
import java.util.Locale;

/**
 * Hello world!
 */
public class App {
    private static final SessionFactory ourSessionFactory;
    private static final ServiceRegistry serviceRegistry;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }
//
//    public static void main(final String[] args) throws Exception {
//        final Session session = getSession();
//        try {
//            System.out.println("querying all the managed entities...");
//            final Map metadataMap = session.getSessionFactory().getAllClassMetadata();
//            for (Object key : metadataMap.keySet()) {
//                final ClassMetadata classMetadata = (ClassMetadata) metadataMap.get(key);
//                final String entityName = classMetadata.getEntityName();
//                final Query query = session.createQuery("from " + entityName);
//                System.out.println("executing: " + query.getQueryString());
//                for (Object o : query.list()) {
//                    System.out.println("  " + o);
//                }
//            }
//        } finally {
//            session.close();
//        }
//    }

    public static void main(String[] args) {
        App test = new App();
        test.add();
//        test.find();
    }

    public void add() {

        final Session session = getSession();
        try {
            session.beginTransaction();
            News p = new News("wo", "aro", Date.valueOf("2015-05-03"));
            session.save(p);
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

//    public void find() {
//        Configuration config = new AnnotationConfiguration();
//        config.configure();
//        SessionFactory sessionFactory = config.buildSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Category c = (Category) session.get(Category.class, 5);
//        System.out.println("id: " + c.getId() + "  name:" + c.getName());
//        Set<Product> p = c.getProducts();
//        for (Product product : p) {
//            System.out.println("id:" + product.getId() + "  name:" + product.getName() + "  description:" + product.getDescripton());
//        }
//        session.getTransaction().commit();
//    }
}

