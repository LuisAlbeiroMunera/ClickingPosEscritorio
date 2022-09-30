TYPE=VIEW
query=(select `bdclick3`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick3`.`invtrasladosprincipal`.`cantidad`),\'0\',`bdclick3`.`invtrasladosprincipal`.`cantidad`)) AS `salidas` from (`bdclick3`.`bdproductos` left join `bdclick3`.`invtrasladosprincipal` on((`bdclick3`.`invtrasladosprincipal`.`producto` = `bdclick3`.`bdproductos`.`Codigo`))) group by `bdclick3`.`bdproductos`.`Codigo`)
md5=1f5ca757fbc404b183cd1234a881c074
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:51
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invtrasladosprincipal`.`cantidad`),\'0\',`invtrasladosprincipal`.`cantidad`)) AS `salidas` from (`bdproductos` left join `invtrasladosprincipal` on((`invtrasladosprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick3`.`invtrasladosprincipal`.`cantidad`),\'0\',`bdclick3`.`invtrasladosprincipal`.`cantidad`)) AS `salidas` from (`bdclick3`.`bdproductos` left join `bdclick3`.`invtrasladosprincipal` on((`bdclick3`.`invtrasladosprincipal`.`producto` = `bdclick3`.`bdproductos`.`Codigo`))) group by `bdclick3`.`bdproductos`.`Codigo`)
mariadb-version=100135
