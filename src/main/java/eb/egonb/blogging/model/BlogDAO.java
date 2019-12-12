package eb.egonb.blogging.model;

import org.springframework.data.repository.CrudRepository;

public interface BlogDAO extends CrudRepository<Blog, Integer> {
}
