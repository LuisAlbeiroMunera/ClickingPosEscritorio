TYPE=VIEW
query=select `bdclick2`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick2`.`bdfactura`.`cantidad`),\'0\',`bdclick2`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega1` left join `bdclick2`.`bdfactura` on((`bdclick2`.`bdfactura`.`producto` = `bdclick2`.`bdproductosbodega1`.`idSistema`))) where (`bdclick2`.`bdfactura`.`bodega` = \'BODEGA-1\') group by `bdclick2`.`bdproductosbodega1`.`idSistema`
md5=3991198dd0c728654223b47bc4ed78c5
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:50
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega1`.`idSistema`))) where (`bdfactura`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick2`.`bdfactura`.`cantidad`),\'0\',`bdclick2`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega1` left join `bdclick2`.`bdfactura` on((`bdclick2`.`bdfactura`.`producto` = `bdclick2`.`bdproductosbodega1`.`idSistema`))) where (`bdclick2`.`bdfactura`.`bodega` = \'BODEGA-1\') group by `bdclick2`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
