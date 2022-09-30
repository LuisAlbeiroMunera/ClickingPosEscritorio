TYPE=VIEW
query=select `bdclick2`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick2`.`bdfactura`.`cantidad`),\'0\',`bdclick2`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega3` left join `bdclick2`.`bdfactura` on((`bdclick2`.`bdfactura`.`producto` = `bdclick2`.`bdproductosbodega3`.`idSistema`))) where (`bdclick2`.`bdfactura`.`bodega` = \'BODEGA-3\') group by `bdclick2`.`bdproductosbodega3`.`idSistema`
md5=e176fc6bfd6571b693c5e15008a3e3d2
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:50
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega3`.`idSistema`))) where (`bdfactura`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick2`.`bdfactura`.`cantidad`),\'0\',`bdclick2`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega3` left join `bdclick2`.`bdfactura` on((`bdclick2`.`bdfactura`.`producto` = `bdclick2`.`bdproductosbodega3`.`idSistema`))) where (`bdclick2`.`bdfactura`.`bodega` = \'BODEGA-3\') group by `bdclick2`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
