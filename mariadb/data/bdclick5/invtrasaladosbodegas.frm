TYPE=VIEW
query=(select `bdclick5`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick5`.`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`bdclick5`.`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdclick5`.`bdproductos` left join `bdclick5`.`invtrasladosbodegasprincipal` on((`bdclick5`.`invtrasladosbodegasprincipal`.`producto` = `bdclick5`.`bdproductos`.`Codigo`))) group by `bdclick5`.`bdproductos`.`Codigo`)
md5=01c0434ccafe9eb942f574304632ee67
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdproductos` left join `invtrasladosbodegasprincipal` on((`invtrasladosbodegasprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick5`.`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`bdclick5`.`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdclick5`.`bdproductos` left join `bdclick5`.`invtrasladosbodegasprincipal` on((`bdclick5`.`invtrasladosbodegasprincipal`.`producto` = `bdclick5`.`bdproductos`.`Codigo`))) group by `bdclick5`.`bdproductos`.`Codigo`)
mariadb-version=100135
