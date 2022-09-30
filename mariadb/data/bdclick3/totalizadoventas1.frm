TYPE=VIEW
query=select `bdclick3`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick3`.`bdfactura`.`cantidad`),\'0\',`bdclick3`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductosbodega1` left join `bdclick3`.`bdfactura` on((`bdclick3`.`bdfactura`.`producto` = `bdclick3`.`bdproductosbodega1`.`idSistema`))) where (`bdclick3`.`bdfactura`.`bodega` = \'BODEGA-1\') group by `bdclick3`.`bdproductosbodega1`.`idSistema`
md5=c2a556558cddb68a0531338eb9768152
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:56
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega1`.`idSistema`))) where (`bdfactura`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick3`.`bdfactura`.`cantidad`),\'0\',`bdclick3`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductosbodega1` left join `bdclick3`.`bdfactura` on((`bdclick3`.`bdfactura`.`producto` = `bdclick3`.`bdproductosbodega1`.`idSistema`))) where (`bdclick3`.`bdfactura`.`bodega` = \'BODEGA-1\') group by `bdclick3`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
