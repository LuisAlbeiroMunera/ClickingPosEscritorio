TYPE=VIEW
query=select `bdclick1`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick1`.`bdfactura`.`cantidad`),\'0\',`bdclick1`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductos` left join `bdclick1`.`bdfactura` on((`bdclick1`.`bdfactura`.`producto` = `bdclick1`.`bdproductos`.`idSistema`))) where ((`bdclick1`.`bdfactura`.`bodega` = \'123-22\') or (`bdclick1`.`bdfactura`.`bodega` = \'\')) group by `bdclick1`.`bdproductos`.`idSistema`
md5=a387b663877d060c29cbdbc3d67b5ce9
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:40
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) where ((`bdfactura`.`bodega` = \'123-22\') or (`bdfactura`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick1`.`bdfactura`.`cantidad`),\'0\',`bdclick1`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductos` left join `bdclick1`.`bdfactura` on((`bdclick1`.`bdfactura`.`producto` = `bdclick1`.`bdproductos`.`idSistema`))) where ((`bdclick1`.`bdfactura`.`bodega` = \'123-22\') or (`bdclick1`.`bdfactura`.`bodega` = \'\')) group by `bdclick1`.`bdproductos`.`idSistema`
mariadb-version=100135
