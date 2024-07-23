package cloud.webgen.web.crud.sql.repository;

import cloud.webgen.web.crud.core.domain.model.WebGenAuditModel;
import cloud.webgen.web.crud.core.domain.ports.WebgenAuditRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface SimpleCRUDSQLRepository<T extends WebGenAuditModel> extends WebgenAuditRepository<T> {
}
