TYPE=VIEW
query=select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick3`.`bdfactura`.`cantidad`),\'0\',`bdclick3`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join `bdclick3`.`bdfactura` on((`bdclick3`.`bdfactura`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) where ((`bdclick3`.`bdfactura`.`bodega` = \'123-22\') or (`bdclick3`.`bdfactura`.`bodega` = \'\')) group by `bdclick3`.`bdproductos`.`idSistema`
md5=6f4bbd515b14f1b763cb1ab6c0b0e829
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:56
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) where ((`bdfactura`.`bodega` = \'123-22\') or (`bdfactura`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick3`.`bdfactura`.`cantidad`),\'0\',`bdclick3`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join `bdclick3`.`bdfactura` on((`bdclick3`.`bdfactura`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) where ((`bdclick3`.`bdfactura`.`bodega` = \'123-22\') or (`bdclick3`.`bdfactura`.`bodega` = \'\')) group by `bdclick3`.`bdproductos`.`idSistema`
mariadb-version=100135
