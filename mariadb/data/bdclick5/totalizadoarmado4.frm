TYPE=VIEW
query=select `bdclick5`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega4` left join `bdclick5`.`armados` on((`bdclick5`.`bdproductosbodega4`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-4\') group by `bdclick5`.`bdproductosbodega4`.`idSistema`
md5=7a6d164d6671ee8d48a4f5531b19835a
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:51
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdproductosbodega4` left join `armados` on((`bdproductosbodega4`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega4` left join `bdclick5`.`armados` on((`bdclick5`.`bdproductosbodega4`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-4\') group by `bdclick5`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
